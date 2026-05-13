class Solution {
    public List<String> removeComments(String[] source) {
        List<String> dest = new ArrayList<>();
        boolean inBlock = false;
        StringBuilder sb = new StringBuilder();
        for (String line: source) {
            sb = inBlock ? sb : new StringBuilder();
            char[] schars = line.toCharArray();
            int n = schars.length;
            for (int i = 0; i < n; i++) {
                if (inBlock) {
                    if (schars[i] == '*' && i < n-1 && schars[i+1] == '/') {
                        inBlock = false;
                        i++;
                    }
                } else if (schars[i] == '/' && i < n-1 && schars[i+1] == '/') {
                    // found line comment. Abandon rest of line
                    break;
                } else if (schars[i] == '/' && i < n-1 && schars[i+1] == '*') {
                    inBlock = true;
                    i ++;
                } else {
                    sb.append(schars[i]);
                }
            }
            if (!inBlock && ! sb.isEmpty()) {
                dest.add(sb.toString());
            }
        }
        return dest;
    }

}