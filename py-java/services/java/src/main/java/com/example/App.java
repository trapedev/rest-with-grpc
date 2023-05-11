package com.example;

import com.example.pb.ExampleServicesGrpc.ExampleServicesImplBase;
import com.example.pb.Services.ExampleRequest;
import com.example.pb.Services.ExampleResponse;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Server server = ServerBuilder.forPort(50051).addService(new ExampleServicesImpl()).build().start();
        System.out.println("Starting gRPC Server at port:50051 ...");
        server.awaitTermination();
    }

    static class ExampleServicesImpl extends ExampleServicesImplBase {

        @Override
        public void example(ExampleRequest req, StreamObserver<ExampleResponse> responseObserver) {
            ExampleResponse response = ExampleResponse.newBuilder().setRes("successed").build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }
}
