class StringBufferAndBuilder 
{
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer("Rayan");
        sb.append(" Azam");

        sb.delete(0, 3);
        System.out.println(sb);
    }
}
