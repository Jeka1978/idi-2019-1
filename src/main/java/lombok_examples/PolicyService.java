package lombok_examples;

/**
 * @author Evgeny Borisov
 */
public class PolicyService {

    private Integer age;
    private Integer numberOfAccidents;
    private Integer vetek;

    private PolicyService(int age, int numberOfAccidents, int vetek) {
        this.age = age;
        this.numberOfAccidents = numberOfAccidents;
        this.vetek = vetek;
    }

    public static class Builder{
        private Integer age;
        private Integer numberOfAccidents;
        private Integer vetek;

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder numberOfAccidents(int numberOfAccidents) {
            this.numberOfAccidents = numberOfAccidents;
            return this;
        }

        public Builder vetek(int vetek) {
            this.vetek = vetek;
            return this;
        }

        public PolicyService build(){
            validate();
            return new PolicyService(age, numberOfAccidents, vetek);
        }

        private void validate() {
            if (numberOfAccidents == null || age == null || vetek == null) {
                throw new IllegalStateException("something was null");
            }
        }
    }















}
