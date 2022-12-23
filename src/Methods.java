public class Methods extends Main{
    private String name, id;
    String getId() {
        return this.id;
    }

    void setId(String id) {
        this.id = id;
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }
    void SaveData() {
        System.out.println("Escreva o id do produto: ");
        setId(scan.next()+"; ");
        System.out.println("Escreva o nome do produto: ");
        setName(scan.next()+"; ");

        bufferidproduct.append(getId());
        buffernameproduct.append(getName());
    }
    void ShowData() {
        System.out.println(bufferidproduct+"\n"+buffernameproduct);
    }
}