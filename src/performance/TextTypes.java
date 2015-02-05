package performance;

public enum TextTypes {
  ONE("TextOne"), TWO("TextTwo");

  String type;

  TextTypes(String type) {
    this.type = type;
  }

  String getType() {
    return type;
  }
}
