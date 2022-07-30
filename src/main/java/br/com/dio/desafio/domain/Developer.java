package br.com.dio.desafio.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import static java.lang.Double.sum;

public class Developer {
    private String name;
    private Set<Content> subscribedContents = new LinkedHashSet<>();
    private Set<Content> doneContents = new LinkedHashSet<>();

    public void subscribeBootcamp(Bootcamp bootcamp){
        this.subscribedContents.addAll(bootcamp.getContents());
        bootcamp.getSubscribedDevelopers().add(this);
    }

    public void goFoward(){
        Optional<Content> content = this.subscribedContents.stream().findFirst();
        if(content.isPresent()) {
            this.doneContents.add(content.get());
            this.subscribedContents.remove(content.get());
        } else {
            System.err.println("Developer not subscribed to Bootcamp");
        }
    }

    public double xpTotalCalculate(){
        return this.doneContents
                .stream()
                .mapToDouble(Content::xpCalculate)
                .sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribedContents() {
        return subscribedContents;
    }

    public void setSubscribedContents(Set<Content> subscribedContents) {
        this.subscribedContents = subscribedContents;
    }

    public Set<Content> getDoneContents() {
        return doneContents;
    }

    public void setDoneContents(Set<Content> doneContents) {
        this.doneContents = doneContents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return Objects.equals(name, developer.name) && Objects.equals(subscribedContents, developer.subscribedContents) && Objects.equals(doneContents, developer.doneContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContents, doneContents);
    }
}
