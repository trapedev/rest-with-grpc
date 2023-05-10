.DEFAULT_GOAL := help
.PHONY: help
help: ## コマンド一覧表示
	@grep -E '^[a-zA-Z_-]+:.*?## .*$$' $(MAKEFILE_LIST) | \
	awk 'BEGIN {FS = ":.*?## "}; {printf "\033[36m%-20s\033[0m %s\n", $$1, $$2}'

.PHONY: history
history:
	git add . \
	&& git commit -m "updated" \
	&& git push origin HEAD

.PHONY: proto
proto:
	rm -rf services/python/pb/*.py \
	&& python3 -m grpc_tools.protoc -I=proto --python_out=services/python/pb --grpc_python_out=services/python/pb services.proto \
	&& rm -rf services/java/src/main/java/com/example/pb/*.java \
	&& protoc --plugin=protoc-gen-grpc_java=/usr/bin/grpc_java_plugin --proto_path=proto --java_out=./services/java/src/main/java/com/example --grpc_java_out=./services/java/src/main/java/com/example proto/services.proto \
	&& cd services/java/src/main/java/example/pb \
	&& sed -e 's/javax\.annotation\.Generated/javax.annotation.processing.Generated/g' ExampleServicesGrpc.java > ~ExampleServicesGrpc.java