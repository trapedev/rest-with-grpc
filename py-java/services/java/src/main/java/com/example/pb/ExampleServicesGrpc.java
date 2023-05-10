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
public final class ExampleServicesGrpc {

  private ExampleServicesGrpc() {}

  public static final String SERVICE_NAME = "pb.ExampleServices";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<pb.Services.ExampleRequest,
      pb.Services.ExampleResponse> getExampleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Example",
      requestType = pb.Services.ExampleRequest.class,
      responseType = pb.Services.ExampleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pb.Services.ExampleRequest,
      pb.Services.ExampleResponse> getExampleMethod() {
    io.grpc.MethodDescriptor<pb.Services.ExampleRequest, pb.Services.ExampleResponse> getExampleMethod;
    if ((getExampleMethod = ExampleServicesGrpc.getExampleMethod) == null) {
      synchronized (ExampleServicesGrpc.class) {
        if ((getExampleMethod = ExampleServicesGrpc.getExampleMethod) == null) {
          ExampleServicesGrpc.getExampleMethod = getExampleMethod =
              io.grpc.MethodDescriptor.<pb.Services.ExampleRequest, pb.Services.ExampleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Example"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pb.Services.ExampleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pb.Services.ExampleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExampleServicesMethodDescriptorSupplier("Example"))
              .build();
        }
      }
    }
    return getExampleMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExampleServicesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExampleServicesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExampleServicesStub>() {
        @java.lang.Override
        public ExampleServicesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExampleServicesStub(channel, callOptions);
        }
      };
    return ExampleServicesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExampleServicesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExampleServicesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExampleServicesBlockingStub>() {
        @java.lang.Override
        public ExampleServicesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExampleServicesBlockingStub(channel, callOptions);
        }
      };
    return ExampleServicesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExampleServicesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExampleServicesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExampleServicesFutureStub>() {
        @java.lang.Override
        public ExampleServicesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExampleServicesFutureStub(channel, callOptions);
        }
      };
    return ExampleServicesFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ExampleServicesImplBase implements io.grpc.BindableService {

    /**
     */
    public void example(pb.Services.ExampleRequest request,
        io.grpc.stub.StreamObserver<pb.Services.ExampleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getExampleMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getExampleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                pb.Services.ExampleRequest,
                pb.Services.ExampleResponse>(
                  this, METHODID_EXAMPLE)))
          .build();
    }
  }

  /**
   */
  public static final class ExampleServicesStub extends io.grpc.stub.AbstractAsyncStub<ExampleServicesStub> {
    private ExampleServicesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExampleServicesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExampleServicesStub(channel, callOptions);
    }

    /**
     */
    public void example(pb.Services.ExampleRequest request,
        io.grpc.stub.StreamObserver<pb.Services.ExampleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExampleMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ExampleServicesBlockingStub extends io.grpc.stub.AbstractBlockingStub<ExampleServicesBlockingStub> {
    private ExampleServicesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExampleServicesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExampleServicesBlockingStub(channel, callOptions);
    }

    /**
     */
    public pb.Services.ExampleResponse example(pb.Services.ExampleRequest request) {
      return blockingUnaryCall(
          getChannel(), getExampleMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ExampleServicesFutureStub extends io.grpc.stub.AbstractFutureStub<ExampleServicesFutureStub> {
    private ExampleServicesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExampleServicesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExampleServicesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pb.Services.ExampleResponse> example(
        pb.Services.ExampleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExampleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXAMPLE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ExampleServicesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ExampleServicesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXAMPLE:
          serviceImpl.example((pb.Services.ExampleRequest) request,
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

  private static abstract class ExampleServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExampleServicesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pb.Services.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExampleServices");
    }
  }

  private static final class ExampleServicesFileDescriptorSupplier
      extends ExampleServicesBaseDescriptorSupplier {
    ExampleServicesFileDescriptorSupplier() {}
  }

  private static final class ExampleServicesMethodDescriptorSupplier
      extends ExampleServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ExampleServicesMethodDescriptorSupplier(String methodName) {
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
      synchronized (ExampleServicesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExampleServicesFileDescriptorSupplier())
              .addMethod(getExampleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
