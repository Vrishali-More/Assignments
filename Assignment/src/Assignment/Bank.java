package Assignment;
// for encapsulation we declare a class Bank
public class Bank {
  long accno;
  String name;
  int BranchId;
  
  protected long getAccno() {
	return accno;
}
  protected void setAccno(long accno) {
	this.accno = accno;
}
protected String getName() {
	return name;
}
protected void setName(String name) {
	this.name = name;
}
public int getBranchId() {
	return BranchId;
}
public void setBranchId(int branchId) {
	BranchId = BranchId;
}

 
}
