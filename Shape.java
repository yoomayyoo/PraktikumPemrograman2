package soal1;

public abstract class Shape {
	protected String shapeName;
	
	public Shape(String name) {
		this.shapeName = name;
	}
	
	public abstract double area();
	
	@Override
	public String toString(){
		return this.shapeName;
	}
	
	 public void setShapeName(String shapeName) {
       this.shapeName = shapeName;
    }

    public String getShapeName() {
        return this.shapeName;
    }
}