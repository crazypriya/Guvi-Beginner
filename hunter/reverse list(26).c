#include<stdio.h>
void main()
{
int n[20],m,i;
scanf("%d",&m);
for(i=1;i<=m;i++)
{
	scanf("\n%d",&n[i]);
}
for(i=m;i>0;i--)
{
printf("%d->",n[i]);
}
}

