package recursion;

public class Test {
    public static void main(String[] args){
        User user = new User();
        // StackOverflowError
        user.setReferralId(112L);
    }

    static class User{
        long id;
        User referal = new User();
        public void setReferralId(long referalId){
            this.referal.id = referalId;
        }
    }
}
