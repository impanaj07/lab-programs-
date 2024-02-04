#include<stdio.h>
void main()
{
int a[50][50],source,n,i,j,s[10];
printf("enter the number of elements");
scanf("%d",&n);
printf("enter the adjacency matrix");
for(i=0;i<n;i++)
for(j=0;j<n;j++)
{
    scanf("%d",a[i][j]);
}
for(i=0;i<n;i++)
s[i]=0;
printf("enter the source");
scanf("%d",&souce);
dfs(n,a,source,s);
}
dfs(int n,int a[50][50],int source,int s[10])
{
    s[source]=1;
 for(i=0;i<n;i++)
 if(a[source][i]=1&& s[i]=0)
dfs(n,a,source,s); 
}