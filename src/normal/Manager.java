package normal;

public class Manager implements ILead{

	@Override
	public void createSubTask() {
		System.out.print("Manager created sub task");
		
	}

	@Override
	public void assignSubTask() {
		System.out.print("Manager assign sub task");
		
	}

	@Override
	public void workOnTask() {
		// TODO Auto-generated method stub
		
	}

}
