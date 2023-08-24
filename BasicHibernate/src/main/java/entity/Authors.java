package entity;

import jakarta.persistence.*;

@Entity
@Table(name="Authors")
@NamedQuery(name = "Authors.findAuthorById", query = "SELECT u FROM Authors u WHERE u.id=:authorId")
public class Authors {
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "AuthorId")
    private int authorId;
    @Basic
    @Column(name = "Name")
    private String name;

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Authors authors = (Authors) o;

        if (authorId != authors.authorId) return false;
        if (name != null ? !name.equals(authors.name) : authors.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = authorId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Authors{" +
                "authorId=" + authorId +
                ", name='" + name + '\'' +
                '}';
    }
}
