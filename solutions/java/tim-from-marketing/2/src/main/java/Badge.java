class Badge {
    public String print(Integer id, String name, String department) {
      if (department == null) {
        department = "OWNER";
      }
      String result = name + " - " + department.toUpperCase();
      if (id == null) {
        return result;
      }
      return "[" + id + "] - " + result; 
    }
}
