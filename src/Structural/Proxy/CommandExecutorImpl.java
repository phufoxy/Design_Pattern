package Structural.Proxy;

public class CommandExecutorImpl implements CommandExecutor {
    @Override
    public void runCommand(String cmd) throws Exception {
//        some heavy in implmentation
        Runtime.getRuntime().exec(cmd);
        System.out.println(" ' " + cmd +" ' command executed");
    }
}
