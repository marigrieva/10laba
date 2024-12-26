import classes.Faculty;
import classes.Institute;
import classes.ResearchAssociate;



public class Main {

    public static void main(String[] args) {
        Faculty fkn = new Faculty("ФКН");
        Institute toisi = new Institute("ТОиЗи", "297");
        Institute is = new Institute("иС", "387");
        Institute tst = new Institute("ЦТ", "311п");
        Institute itu = new Institute("иТУ", "312п");
        Institute piit = new Institute("ПииТ", "380");
        fkn.setInstitutes(new Institute[]{toisi, is, tst, itu, piit});
        ResearchAssociate emp1 = new ResearchAssociate(1234, "Сирота Александр Анатольевич",
                "Information protection");
        ResearchAssociate emp2 = new ResearchAssociate(1234, "Митрофанова Елена Юрьевна",
                "Моделирование систем");
        ResearchAssociate emp3 = new ResearchAssociate(1234, "Гаршина Вероника Викторовна",
                "Интеллектуальные системы");
        ResearchAssociate emp4 = new ResearchAssociate(1234, "иванков Александр Юрьевич",
                "Распознавание образов");
        ResearchAssociate emp5 = new ResearchAssociate(1234, "Акимов Алексей Викторович",
                "Технологии обработки информации");
        toisi.setEmployees(new ResearchAssociate[]{emp1, emp2, emp3, emp4, emp5});
        Institute[] fkn_institutes = fkn.getInstitutes();
        System.out.println("Кафедры на факультете " + fkn.getName() + ": \n");
        for (int i = 0; i < fkn_institutes.length; i++) {
            System.out.println(fkn_institutes[i].getName());
        }
        System.out.println("\n");
        ResearchAssociate[] toizi_employees = toisi.getEmployees();
        System.out.println("Сотрудники кафедры " + toisi.getName() + ": \n");
        for (int i = 0; i < toizi_employees.length; i++) {
            System.out.println(toizi_employees[i].getName());
        }
        
    }
}
