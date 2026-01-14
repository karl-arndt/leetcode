class NumberOfSeniorCitizens {
    public int countSeniors(String[] details) {
        int count = 0;
        for (String detail : details) {
            if (detail.charAt(11) == '6' && detail.charAt(12) > '0' || detail.charAt(11) > '6') {
                count++;
            }
        }
        return count;
    }
}