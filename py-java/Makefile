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
	python3 -m grpc_tools.protoc -I=proto --python_out=services/python/pb --grpc_python_out=services/python/pb services.proto