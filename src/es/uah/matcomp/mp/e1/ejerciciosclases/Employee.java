package es.uah.matcomp.mp.e1.ejerciciosclases;
//1.4
public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;



    // No puedo definir el objeto percent en el contrato Employee, pues según la UML, dicho objeto NO forma parte del contrato
    // Para que pueda dar resultado el raisePercent, tendría que haber un objeto percent definido, si no lo puedo definir en este contrato, y al crear una
    // clase Percent NO admite el metodoraise cuando lo codifico fuera de la clase percent; y pese a no mostrar error en la clase Employee,
    //sí que lo muestra en TestEmployee cuando defino el metodoraise y el metodoToString dentro de la clase Percent si la contengo dentro de la clase Employee
    // hasta nuevo aviso, quizá sea preferible dejar solamente el metodoraise como inusable en los test a meter informacion que NO se ha pedido en el contrato,
    // pues este se quebraría

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + lastName;
    }

    public int getSalary() {
        return salary;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }


    public int getAnnualSalary() {
        return salary * 12;
    }

    //espere

    public int raiseSalary(int percent) {

        return this.salary  = salary + salary*percent/100 ;

    }

    public String toString() {
        return "Employee [id = " + id + " name = " + getFirstName() + getLastName() + " salary = " +
                getSalary() + " raise= " +salary  +  "Annual salary = " +  getAnnualSalary()+ "]";

    }


        }



















