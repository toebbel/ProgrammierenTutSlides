
public class Test {
	private IOElement[] filesystem;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Test me = new Test();
		System.out.println(me.contains("fileA"));
		System.out.println(me.contains("file0"));
		System.out.println(me.contains("fileH"));
		
		/*Task 2
		 * System.out.println(me.getPathTo("fileA"));
		 * System.out.println(me.getPathTo("file0"));
		 * System.out.println(me.getPathTo("fileH"));
		*/
	}
	
	private Test() {
		IOElement myFileA = new IOElement("fileA");
		IOElement myFileB = new IOElement("fileB");
		IOElement myFileC = new IOElement("fileC");
		IOElement myFileD = new IOElement("fileD");
		IOElement myFileE = new IOElement("fileE");
		IOElement myFileF = new IOElement("fileF");
		IOElement myFileG = new IOElement("fileG");
		IOElement myFileH = new IOElement("fileH");
		IOElement myFolder1 = new IOElement("Folder1");
		IOElement myFolder2 = new IOElement("Folder2");
		IOElement myFolder3 = new IOElement("Folder3");
		IOElement myFolder4 = new IOElement("Folder4");
		IOElement myFolder5 = new IOElement("Folder5");
		
		myFolder5.setChildren(new IOElement[] { myFileH });
		myFolder4.setChildren(new IOElement[] { myFileG, myFolder5 });
		myFolder3.setChildren(new IOElement[] { myFolder4, myFileF, myFileE });
		myFolder1.setChildren(new IOElement[] {myFileA});
		filesystem = new IOElement[] {myFileB, myFileC, myFileD, myFolder1, myFolder2, myFolder3};
	}

	public boolean contains(String element) {
		return contains(element, filesystem);
	}
	
	private boolean contains(String element, IOElement[] in) {
		if (in == null) {
			return false;
		}
		
		for(int i = 0; i < in.length; i++) {
			if (in[i].getName().equals(element)) {
				return true;
			}
			
			if (contains(element, in[i].getChildren())) {
				return true;
			}
		}
		return false;
	}
	
	public String getPathTo(String element) {
		String path = getPathTo(element, filesystem, "");
		if (path == "") {
			path = "not found :-(";
		}
		return path;
	}
	
	private String getPathTo(String element, IOElement[] in, String path) {
		if (in == null) {
			return "";
		}
		
		for(int i = 0; i < in.length; i++) {
			if (in[i].getName().equals(element)) {
				return path + "\\" + element;
			}
			String subSearch = getPathTo(element, in[i].getChildren(), path + "\\" + in[i].getName());
			if (subSearch != "") {
				return subSearch; 
			}
		}
		return "";
	}
}
