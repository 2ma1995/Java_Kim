package exception.ex2;

public class NetworkServiceV2_4 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); //에러 추가

        try {
            client.connect();
            client.send(data); //1. RuntimeException은 catch 대상이 아님. 예외가 밖으로 던져짐
            // throw new RuntimeException("ex"); 가 발생
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
        }
        client.disconnect(); // 위치를 여기로 잡으면, 연결해제사용가능 but //2. RuntimeException상황에서는 이코드가 호출이안됌.
    }
}
