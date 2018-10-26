
public class HashCodeAndEqual {
	private String hashName;
	private String hashValue; 
	
	public String getHashName() {
		return hashName;
	}
	public void setHashName(String hashName) {
		this.hashName = hashName;
	}
	public String getHashValue() {
		return hashValue;
	}
	public void setHashValue(String hashValue) {
		this.hashValue = hashValue;
	}
	
	@Override
	public boolean equals(Object o){
		if(o == null) return false;
		if(o.getClass() != this.getClass()) return false;
		HashCodeAndEqual h =(HashCodeAndEqual)o;
		return (this.hashName == h.hashName || this.hashName.equals(h.hashName)) && (this.hashValue == h.hashValue || this.hashValue.equals(h.hashValue));
	}
	
	 @Override
	public int hashCode(){
		 int hashcode = (this.hashName == null ? 0:this.hashName.hashCode() ) + (this.hashValue == null ? 0 : this.hashValue.hashCode());
		return hashcode;
	} 

}
