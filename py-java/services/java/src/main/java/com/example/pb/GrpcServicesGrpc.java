package pb;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: services.proto")
public final class GrpcServicesGrpc {

  private GrpcServicesGrpc() {}

  public static final String SERVICE_NAME = "pb.GrpcServices";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<pb.Services.ExampleRequest,
      pb.Services.ExampleResponse> getExampleCallerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExampleCaller",
      requestType = pb.Services.ExampleRequest.class,
      responseType = pb.Services.ExampleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pb.Services.ExampleRequest,
      pb.Services.ExampleResponse> getExampleCallerMethod() {
    io.grpc.MethodDescriptor<pb.Services.ExampleRequest, pb.Services.ExampleResponse> getExampleCallerMethod;
    if ((getExampleCallerMethod = GrpcServicesGrpc.getExampleCallerMethod) == null) {
      synchronized (GrpcServicesGrpc.class) {
        if ((getExampleCallerMethod = GrpcServicesGrpc.getExampleCallerMethod) == null) {
          GrpcServicesGrpc.getExampleCallerMethod = getExampleCallerMethod =
              io.grpc.MethodDescriptor.<pb.Services.ExampleRequest, pb.Services.ExampleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExampleCaller"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pb.Services.ExampleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pb.Services.ExampleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServicesMethodDescriptorSupplier("ExampleCaller"))
              .build();
        }
      }
    }
    return getExampleCallerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GrpcServicesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcServicesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcServicesStub>() {
        @java.lang.Override
        public GrpcServicesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcServicesStub(channel, callOptions);
        }
      };
    return GrpcServicesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GrpcServicesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcServicesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcServicesBlockingStub>() {
        @java.lang.Override
        public GrpcServicesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcServicesBlockingStub(channel, callOptions);
        }
      };
    return GrpcServicesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GrpcServicesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcServicesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcServicesFutureStub>() {
        @java.lang.Override
        public GrpcServicesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcServicesFutureStub(channel, callOptions);
        }
      };
    return GrpcServicesFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GrpcServicesImplBase implements io.grpc.BindableService {

    /**
     */
    public void exampleCaller(pb.Services.ExampleRequest request,
        io.grpc.stub.StreamObserver<pb.Services.ExampleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getExampleCallerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getExampleCallerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                pb.Services.ExampleRequest,
                pb.Services.ExampleResponse>(
                  this, METHODID_EXAMPLE_CALLER)))
          .build();
    }
  }

  /**
   */
  public static final class GrpcServicesStub extends io.grpc.stub.AbstractAsyncStub<GrpcServicesStub> {
    private GrpcServicesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcServicesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcServicesStub(channel, callOptions);
    }

    /**
     */
    public void exampleCaller(pb.Services.ExampleRequest request,
        io.grpc.stub.StreamObserver<pb.Services.ExampleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExampleCallerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GrpcServicesBlockingStub extends io.grpc.stub.AbstractBlockingStub<GrpcServicesBlockingStub> {
    private GrpcServicesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcServicesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcServicesBlockingStub(channel, callOptions);
    }

    /**
     */
    public pb.Services.ExampleResponse exampleCaller(pb.Services.ExampleRequest request) {
      return blockingUnaryCall(
          getChannel(), getExampleCallerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GrpcServicesFutureStub extends io.grpc.stub.AbstractFutureStub<GrpcServicesFutureStub> {
    private GrpcServicesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcServicesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcServicesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pb.Services.ExampleResponse> exampleCaller(
        pb.Services.ExampleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExampleCallerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXAMPLE_CALLER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GrpcServicesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GrpcServicesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXAMPLE_CALLER:
          serviceImpl.exampleCaller((pb.Services.ExampleRequest) request,
              (io.grpc.stub.StreamObserver<pb.Services.ExampleResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GrpcServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GrpcServicesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pb.Services.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GrpcServices");
    }
  }

  private static final class GrpcServicesFileDescriptorSupplier
      extends GrpcServicesBaseDescriptorSupplier {
    GrpcServicesFileDescriptorSupplier() {}
  }

  private static final class GrpcServicesMethodDescriptorSupplier
      extends GrpcServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GrpcServicesMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GrpcServicesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GrpcServicesFileDescriptorSupplier())
              .addMethod(getExampleCallerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
