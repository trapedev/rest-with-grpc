from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Optional as _Optional

DESCRIPTOR: _descriptor.FileDescriptor

class ExampleRequest(_message.Message):
    __slots__ = ["message"]
    MESSAGE_FIELD_NUMBER: _ClassVar[int]
    message: str
    def __init__(self, message: _Optional[str] = ...) -> None: ...

class ExampleResponse(_message.Message):
    __slots__ = ["res"]
    RES_FIELD_NUMBER: _ClassVar[int]
    res: str
    def __init__(self, res: _Optional[str] = ...) -> None: ...
