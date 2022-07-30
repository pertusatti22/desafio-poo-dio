package br.com.dio.desafio.domain;

public class Course extends Content {
    private int workLoad;

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", workLoad=" + workLoad +
                '}';
    }

    @Override
    public double xpCalculate(){
        return STANDARD_XP * workLoad;
    }

    public int getWorkLoad() {
        return workLoad;
    }

    public void setWorkLoad(int workLoad) {
        this.workLoad = workLoad;
    }
}
