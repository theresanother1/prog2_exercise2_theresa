import trafficlight.ctrl.TrafficLightCtrl;


public class MCP {
    public static void main(String[] args) {
        System.out.println("blubb blubb");
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
                //new TrafficLightCtrl();
        ctrl.run();
    }
}