package shopping.common.model;

public class Combo04 {
	private String id ; // 이름
	private int amount ; // 매출 총액
	
	public Combo04() {
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String toString() {
		return "Combo04 [id=" + id + ", amount=" + amount + ", getId()=" + getId() + ", getAmount()=" + getAmount()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
		
	
	
}