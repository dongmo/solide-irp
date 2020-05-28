package normal;

public class TeamLead implements ILead{

	@Override
	public void createSubTask() {
		System.out.print("Team Lead created sub task");
		
	}

	@Override
	public void assignSubTask() {
		System.out.print("Team Lead assign sub task");
		
	}

	@Override
	public void workOnTask() {
		System.out.print("Team Lead work on sub task");
		
	}

}
