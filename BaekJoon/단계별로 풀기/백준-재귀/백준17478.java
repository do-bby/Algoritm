import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    static String rt = "";
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
        self(n);
    }
    public static void self(int a){
        String t = rt;
        if(a == 0){
            System.out.println(t + "\"����Լ��� ������?\"");
			System.out.println(t +"\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
			System.out.println(t + "��� �亯�Ͽ���.");
			return;
        }
        System.out.println(t + "\"����Լ��� ������?\"");
		System.out.println(t + "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
		System.out.println(t + "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
		System.out.println(t + "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
				
		rt += "____";
		self(a - 1);
		
		System.out.println(t + "��� �亯�Ͽ���.");
    }
}