package badcode;

import java.util.ArrayList;

public class Bank {
    ArrayList<Account> accs = new ArrayList<>();
    ArrayList<String[]> customernames = new ArrayList<>();

    public Bank()
    {
           accs.add(new Account(2));
          accs.add(new Account(390));
          accs.add(new Account(4444));
        customernames.add(new String[]{"Bob", "password"});
          customernames.
                  add(new
                          String[]{"John", "password2"
                  });
          customernames.add(new String[]{"Birgit", "password3"});
  }

    public int withdrawmoney(String name, String password, double ammount)
    {
        String returned = "0";
        int l = 0;
        for (String[] i : customernames) {
             if (i[0] == name) {
                if (password.equals(i[1])) {
                    if (!(ammount < 0)) {
                        Account o = accs.get(l);

              returned = accs.get(l).getAmount() + "";
                        returned = (Double.parseDouble(returned) - ammount) + "";
                        o.setAmount(Double.parseDouble(returned));
                        returned = ammount + "";
                        System.out.println("Money withdrawed " + returned);
                        System.out.println("Current balance:" + o.getAmount());
                    }
                   }
            }
            l++;
        }
        return Integer.parseInt(returned);
    }
}
