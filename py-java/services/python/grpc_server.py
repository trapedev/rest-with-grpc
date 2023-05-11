import grpc
from concurrent import futures
import pb.services_pb2_grpc as example_grpc_services

def run_grpc_server():
    server = grpc.server(futures.ThreadPoolExecutor(max_workers=10))
    example_grpc_services.add_ExampleServicesServicer_to_server(example_grpc_services.ExampleServices(), server)
    server.add_insecure_port('[::]:50051')
    server.start()
    print("starting grpc server at port:50051 ...")
    server.wait_for_termination()
    
if __name__ == "__main__":
    run_grpc_server()