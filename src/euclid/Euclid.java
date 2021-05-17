package euclid;

public class Euclid {
public static int cmmdc(int A, int B)
{
	if(B == 0)
	{
		return A;
	}
	return cmmdc(B, A % B);
}
public static void main(String[] args)
{
assert(cmmdc(4,16)==4);
assert(cmmdc(16,4)==4);
assert(cmmdc(15,60)==15);
assert(cmmdc(15,65)==5);
assert(cmmdc(1052,52)==4);
}
}
