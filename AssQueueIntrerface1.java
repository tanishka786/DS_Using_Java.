import java.util.LinkedList;
import java.util.Queue;

public class QueueSplitter {

    public static class Patient {
        private int age;

        public Patient(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }
    }

    public static Queue<Patient>[] splitQueue(Queue<Patient> patientsQueue) {
        Queue<Patient> elderlyQueue = new LinkedList<>();
        Queue<Patient> nonElderlyQueue = new LinkedList<>();

        while (!patientsQueue.isEmpty()) {
            Patient patient = patientsQueue.poll();
            if (patient.getAge() >= 60) {
                elderlyQueue.offer(patient);
            } else {
                nonElderlyQueue.offer(patient);
            }
        }

        Queue<Patient>[] result = new Queue[2];
        result[0] = elderlyQueue;
        result[1] = nonElderlyQueue;

        return result;
    }

    public static void main(String[] args) {
        // Creating sample patients
        Patient patient1 = new Patient(45);
        Patient patient2 = new Patient(60);
        Patient patient3 = new Patient(55);
        Patient patient4 = new Patient(70);

        // Creating a queue and adding patients
        Queue<Patient> patientsQueue = new LinkedList<>();
        patientsQueue.offer(patient1);
        patientsQueue.offer(patient2);
        patientsQueue.offer(patient3);
        patientsQueue.offer(patient4);

        // Splitting the queue based on age
        Queue<Patient>[] result = splitQueue(patientsQueue);

        // Extracting the split queues
        Queue<Patient> elderlyQueue = result[0];
        Queue<Patient> nonElderlyQueue = result[1];

        // Printing the results
        System.out.println("Patients aged 60 and above:");
        while (!elderlyQueue.isEmpty()) {
            System.out.println("Age: " + elderlyQueue.poll().getAge());
        }

        System.out.println("\nPatients below the age of 60:");
        while (!nonElderlyQueue.isEmpty()) {
            System.out.println("Age: " + nonElderlyQueue.poll().getAge());
        }
    }
}
