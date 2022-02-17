from flask import Flask

app = Flask(__name__)

@app.route("/")
def hello_world():
    return "Test Application says hello!"

@app.route("/test")
def test_route():
    return "Test route!"


if __name__ == "__main__":
    app.run()
