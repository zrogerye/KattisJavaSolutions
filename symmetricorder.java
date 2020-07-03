

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

public class symmetricorder {
    public static void main(String[] args)throws Exception {
        StringBuilder sb = new StringBuilder();
        //Scanner sc = new Scanner(new File("sample.in"));
        Scanner sc = new Scanner(System.in);
        for(double i = 1, strings = Double.parseDouble(sc.nextLine()); strings > 0; i++, strings = Integer.parseInt(sc.nextLine())) {
            sb.append("SET " + (int)i + System.lineSeparator());
            List<String> ladderPart = new LinkedList<>();
            for(strings /= 2; strings > 0.5; strings--){
                sb.append(sc.nextLine() + System.lineSeparator());
                ladderPart.add(sc.nextLine() + System.lineSeparator());
            }
            if(strings > 0)
                sb.append(sc.nextLine() + System.lineSeparator());
            ladderPart.stream().collect(Collectors.toCollection(LinkedList::new)).descendingIterator().forEachRemaining(((String s) -> sb.append(s)));
        }
        System.out.print(sb);
    }
}
