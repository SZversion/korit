package ch15_casting.control;

public class CentralControl {
    private Power[] deviceArray;

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    public void addDevice(Power device) {
        // Power의 자식 클래스들은 모두 수용가능 하도록 하기 위해서 args에 Power를 삽입
        // Power의 자식 클래스들을 대입할 경우 어차피 암시적으로 Power로 업캐스팅이 일어나기 때문에
        // Power의 자식이 아닌 클래스는 삽입 될 수 없음
        int emptyIndex = checkEmpty();

        if(emptyIndex == -1 ) {
            System.out.println("더 이상 장치를 연결 할 수 없습니다.");
            return;
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName() + "를 " + (emptyIndex+1) + "번째 장치에 연결하였습니다.");
        //getClass() -> 패키지 명을 포함한 클래스명이 반환됨
        //getSimpleName() -> 패키지 명도 날아가고 클래스명이 반환됨
        //매서드 에서 매서드를 호출 -> 매서드 체이닝
    }

    public void deleteDevice(int indexNum) {
        if (deviceArray[indexNum-1] != null) {
            System.out.println(indexNum + "번째 슬롯의 " + deviceArray[indexNum-1].getClass().getSimpleName() + " 디바이스를 제거했습니다.");
            deviceArray[indexNum-1] = null;
        }
    }
    private int checkEmpty() {
        for(int i=0; i<deviceArray.length; i++) {
            if(deviceArray[i] == null) {
                return i;
            }
        }
        return -1;
        // Java 에서 index 넘버는 음수값이 없기 때문에
        // 실패를 나타낼 때 -1 을 쓰는 경우가 많음
    }

    public void powerOn() {
        for(int i=0; i<deviceArray.length; i++) {
            if(deviceArray[i] == null) {
                System.out.println((i+1)+"번째 슬롯은 장치가 연결되어 있지 않습니다.");
                continue;
            }
            deviceArray[i].on();
        }
    }
    public void powerOff() {
        for(int i=0; i<deviceArray.length; i++) {
            if(deviceArray[i] == null) {
                System.out.println((i+1)+"번째 슬롯은 장치가 연결되어 있지 않습니다.");
                continue;
            }
            deviceArray[i].off();
        }
    }

    public void performSpecificMethod() {
        for(Power device : deviceArray) {
            if(device instanceof Computer) {
                Computer computer = (Computer) device;
                computer.compute();
            } else if (device instanceof Mouse) {
                Mouse mouse = (Mouse) device;
                mouse.leftClick();
            } else if (device instanceof LED) {
                LED led = (LED) device;
                led.changeColor();
            } else if (device instanceof Tv) {
                Tv tv = (Tv) device;
                tv.channelUp();
            } else if (device instanceof Speaker) {
                Speaker speaker = (Speaker) device;
                speaker.changeEqual();
            } else if (device instanceof SmartPhone) {
                SmartPhone smartPhone = (SmartPhone) device;
                smartPhone.touchScreen();
            }
        }
    }
}

