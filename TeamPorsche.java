package Project00;

public class TeamPorsche extends Team {
    public TeamPorsche(String name)
    {
        super(name);
        createTeamMembers();
    }

    public void createTeamMembers()
    {
        members.add(new FrancisMember("Francis Severino"));
        members.add(new MohammedMember("Mohammed zakari"));
    }
}
