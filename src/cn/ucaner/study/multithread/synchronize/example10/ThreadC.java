package cn.ucaner.study.multithread.synchronize.example10;

/**
 * Created by brian on 2016/4/13.
 */
public class ThreadC extends Thread {
    private Service service;

    public ThreadC(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.printC();
    }
}
