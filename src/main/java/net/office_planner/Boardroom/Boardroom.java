package net.office_planner.Boardroom;

public class Boardroom {
    private int boardroom_id;
    private String boardroom_name;
    private int organization_id;

    public int getBoardroom_id() {
        return boardroom_id;
    }

    public void setBoardroom_id(int boardroom_id) {
        this.boardroom_id = boardroom_id;
    }

    public String getBoardroom_name() {
        return boardroom_name;
    }

    public void setBoardroom_name(String boardroom_name) {
        this.boardroom_name = boardroom_name;
    }

    public int getOrganization_id() {
        return organization_id;
    }

    public void setOrganization_id(int organization_id) {
        this.organization_id = organization_id;
    }

    @Override
    public String toString() {
        return "Boardroom{" +
                "boardroom_id=" + boardroom_id +
                ", boardroom_name='" + boardroom_name + '\'' +
                ", organization_id=" + organization_id +
                '}';
    }
}
