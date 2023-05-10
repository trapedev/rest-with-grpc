## Set Up

```bash
sudo apt update

sudo apt install -y python3-pip

pip install grpcio-tools

sudo apt install -y libprotoc-dev libprotobuf-dev protobuf-compiler libgrpc-java protobuf-compiler-grpc-java-plugin libgoogle-common-protos-java libguava-java libnetty-java libperfmark-java

cd 

git clone https://github.com/grpc/grpc-java.git

cd grpc-java/compiler

../gradlew java_pluginExecutable -PskipAndroid=true
```