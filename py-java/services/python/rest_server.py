from flask import Flask
app = Flask(__name__)

@app.route('/')
def hello_world():
    return 'Hello World'

def run_rest_server():
    print("starting rest server at port:5000 ...")
    app.run(host='0.0.0.0', port=5000)
