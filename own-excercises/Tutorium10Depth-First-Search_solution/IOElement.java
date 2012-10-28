
public class IOElement {
	private IOElement[] children;
	private String name;
	
	public IOElement(String name) {
		this.name = name;
	}
	
	public IOElement[] getChildren() {
		return children;
	}
	
	public void setChildren(IOElement[] children) {
		this.children = children;
	}
	
	public String getName() {
		return name;
	}


}
