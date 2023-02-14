public class flowerBouquet {

	public flowerBouquet(String test1, String test2)
	{
		flowerColor = test1;
		flowerName = test2;
	}

	public String whichFlower()
	{
		return "This flower is a " + flowerColor + " colored " + flowerName;
	}
	
	public boolean sameFlower(flowerBouquet anObject)
	{
		return (flowerName==anObject.flowerName);
	}
	
	private String flowerName;
	
	private String flowerColor;
	
	public static void main(String[] args)
	{
		flowerBouquet flow = new flowerBouquet("white", "Lily");
		String finalFlower = flow.whichFlower();
		System.out.println(finalFlower);
		
		flowerBouquet flow2 = new flowerBouquet("pink", "Lily");
		System.out.println(flow2.sameFlower(flow));
		
		flowerBouquet flow3 = new flowerBouquet("blue", "Daisy");
		System.out.println(flow3.sameFlower(flow));
		
	}
}
