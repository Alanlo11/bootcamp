public class InsufficientBalanceExecption extends BusinessException{
  public InsufficientBalanceExecption(){
    super(ErrorCode.INSUFF_BAL);
  }

  public String sleep(){
    return "Sleep";
  }
  
}