public class BusinessException extends Exception{ 
  // extends Exception 係checkedexception,寫既時侯就會發現有冇問題
  // extends RunTimeException 係runtime先會發現有問題

  private int code;

  public int getCode() {
    return this.code;
  }

  // implies this is checked exception
  // public BusinessException(int errorCode, String message) {
  // super(message);
  // this.errorCode = errorCode;
  // }

  public BusinessException(ErrorCode errorCode) {
    super(errorCode.getMessage());
    this.code = errorCode.getCode();
  }

  public String codeWithMessage() {
    return "Error: " + this.code + "-" + this.getMessage();
  }
}