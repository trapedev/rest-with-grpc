from flask import Flask
import pb.services_pb2 as services_pb2
import grpc
import pb.services_pb2_grpc as services_pb2_grpc

app = Flask(__name__)

@app.route('/')
def hello_world():
    channel = grpc.insecure_channel('localhost:50051')
    stub = services_pb2_grpc.ExampleServicesStub(channel=channel)
    request = services_pb2.ExampleRequest(message="Hello Server!")
    response = stub.Example(request)
    channel.close()
    return str(response)

def run_rest_server():
    print("starting rest server at port:5000 ...")
    app.run(host='0.0.0.0', port=5000)
    
if __name__ == "__main__":
    run_rest_server()
