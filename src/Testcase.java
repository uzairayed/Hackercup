public class Testcase {
    public boolean testcase(int s, int d, int k) {

        int totalbuns = 2 * s + 2 * d;
        int totalpatties = 1 * s + 2 * d;
        int decker = k;
        int bunsRequire = k+1;
        if (totalbuns >= bunsRequire) {
            int pattiesRequire = k;
            return  totalpatties >= pattiesRequire ;
        }
        else return false;


    }
}