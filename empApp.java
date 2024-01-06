import java.util.*;
public class Employee 
{
	private int bid, bprice;
	private String bname,fauther, bpublication;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getBprice() {
		return bprice;
	}
	public void setBprice(int bprice) {
		this.bprice = bprice;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getFauther() {
		return fauther;
	}
	public void setFauther(String fauther) {
		this.fauther = fauther;
	}
	public String getBpublication() {
		return bpublication;
	}
	public void setBpublication(String bpublication) {
		this.bpublication = bpublication;
	}

}


class empApp
{
	public static void main(String args[])
	{
		int bid,ch;
		int bprice;
		String bname;
		String fauther;
		String bpublication;

		Scanner sc = new Scanner(System.in);
		System.out.println("+++++++++++Welcome to the Universal Library+++++++++++");
		System.out.println("Enter How many books you want to add: ");
		int size = sc.nextInt();
		Employee e[] = new Employee[size];
		do {
			System.out.println("select option from below-\n1: Add all books Details \n2: Display all book details "
					+ "\n3: Display all books from Rs 100 to Rs 200 \n4: Search Book details by \n5: Update Book details by"
					+ "\n6: Delete Book details by \n7: Count Book details by "
					+ "\n8: Ascending order by Id \n9: Exit the Code");
			System.out.println("Enter the choise: ");
			ch = sc.nextInt();

			switch(ch)
			{

			case 1:

				for(int i=0; i<e.length; i++ )
				{

					e[i] = new Employee();

					System.out.println("Enter the book id: ");
					bid = sc.nextInt();

					sc.nextLine();
					System.out.println("Enter the Name of the Book: ");
					bname = sc.nextLine();

					System.out.println("Enter the Book Price: ");
					bprice = sc.nextInt();

					sc.nextLine();
					System.out.println("Enter the Favourite author: ");
					fauther = sc.nextLine();

					System.out.println("Enter the Book's Publication: ");
					bpublication = sc.nextLine();

					e[i].setBid(bid);
					e[i].setBname(bname);
					e[i].setBprice(bprice);
					e[i].setBpublication(bpublication);
					e[i].setFauther(fauther);

				}

				break;

			case 2:

				for(int i=0; i<size; i++ )
				{
					System.out.println(e[i].getBid()+"\t"+e[i].getBname()+"\t"+e[i].getBprice() +"\t"+e[i].getBpublication() +"\t"+e[i].getFauther());
				}

				System.out.println("Do you want to continue: ");
				ch = sc.nextInt();

				break;

			case 3:

				for(int i=0; i<e.length; i++ )
				{
					if(e[i].getBprice()>=100 && e[i].getBprice()<=500)
					{
						System.out.println(e[i].getBid()+"\t"+e[i].getBname()+"\t"+e[i].getBprice() +"\t"+e[i].getBpublication() +"\t"+e[i].getFauther());
					}
				}

				System.out.println("Do you want to continue: ");
				ch = sc.nextInt();
				break;

			case 4:

				System.out.println("select option from below-\n1: Book ID \n2: Book Name"
						+ "\n3: book Price \n4: Book Author");
				System.out.println("Enter the choise: ");
				ch = sc.nextInt();

				switch(ch)
				{
				case 1:
					System.out.println("Enter Book Id you want to search: ");
					int BkId = sc.nextInt();

					for(int i=0; i<e.length; i++ )
					{
						if(BkId == e[i].getBid())
						{
							System.out.println(e[i].getBid()+"\t"+e[i].getBname()+"\t"+e[i].getBprice() +"\t"+e[i].getBpublication() +"\t"+e[i].getFauther());
						}

					}


					break;


				case 2:

					System.out.println("Enter Book Name you want to search: ");
					sc.nextLine();
					String BkName = sc.nextLine();

					for(int i=0; i<e.length; i++ )
					{
						if(BkName.equals(e[i].getBname()))
						{
							System.out.println(e[i].getBid()+"\t"+e[i].getBname()+"\t"+e[i].getBprice() +"\t"+e[i].getBpublication() +"\t"+e[i].getFauther());
						}
					}

					break;


				case 3:

					System.out.println("Enter Book of price you want to search: ");
					int BkPrice = sc.nextInt();

					for(int i=0; i<e.length; i++ )
					{
						if(BkPrice == e[i].getBprice())
						{
							System.out.println(e[i].getBid()+"\t"+e[i].getBname()+"\t"+e[i].getBprice() +"\t"+e[i].getBpublication() +"\t"+e[i].getFauther());
						}
					}
					break;


				case 4:

					System.out.println("Enter Book author Name you want to search: ");
					sc.nextLine();
					String BkAuthor = sc.nextLine();

					for(int i=0; i<e.length; i++ )
					{
						if(BkAuthor.equals(e[i].getFauther()))
						{
							System.out.println(e[i].getBid()+"\t"+e[i].getBname()+"\t"+e[i].getBprice() +"\t"+e[i].getBpublication() +"\t"+e[i].getFauther());
						}
					}

					break;
				}

				System.out.println("Do you want to continue: ");
				ch = sc.nextInt();

				break;

			case 5:

				System.out.println("select update by option from below-\n1: Book ID \n2: Book Name"
						+ "\n3: book Price \n4: Book Author");
				System.out.println("Enter the choise: ");
				ch = sc.nextInt();

				switch(ch)
				{
				case 1:
					System.out.println("Enter Book Id you want to search: ");
					int BkId = sc.nextInt();

					for(int i=0; i<e.length; i++ )
					{
						if(BkId == e[i].getBid())
						{
							System.out.println("Enter the book id: ");
							int nbid = sc.nextInt();

							sc.nextLine();
							System.out.println("Enter the Name of the Book: ");
							String nbname = sc.nextLine();

							System.out.println("Enter the Book Price: ");
							int nbprice = sc.nextInt();

							sc.nextLine();
							System.out.println("Enter the Favourite author: ");
							String nfauther = sc.nextLine();

							System.out.println("Enter the Book's Publication: ");
							String nbpublication = sc.nextLine();

							e[i].setBid(nbid);
							e[i].setBname(nbname);
							e[i].setBprice(nbprice);
							e[i].setBpublication(nbpublication);
							e[i].setFauther(nfauther);
						}

					}
					break;


				case 2:

					System.out.println("Enter Book Name you want to search: ");
					String BkName = sc.nextLine();

					for(int i=0; i<e.length; i++ )
					{
						if(BkName.equals(e[i].getBname()))
						{
							System.out.println("Enter the book id: ");
							int nbid = sc.nextInt();

							sc.nextLine();
							System.out.println("Enter the Name of the Book: ");
							String nbname = sc.nextLine();

							System.out.println("Enter the Book Price: ");
							int nbprice = sc.nextInt();

							sc.nextLine();
							System.out.println("Enter the Favourite author: ");
							String nfauther = sc.nextLine();

							System.out.println("Enter the Book's Publication: ");
							String nbpublication = sc.nextLine();

							e[i].setBid(nbid);
							e[i].setBname(nbname);
							e[i].setBprice(nbprice);
							e[i].setBpublication(nbpublication);
							e[i].setFauther(nfauther);
						}

					}

					break;


				case 3:

					System.out.println("Enter Book Price you want to search: ");
					int BkPrice = sc.nextInt();

					for(int i=0; i<e.length; i++ )
					{
						if(BkPrice == e[i].getBprice())
						{
							System.out.println("Enter the book id: ");
							int nbid = sc.nextInt();

							sc.nextLine();
							System.out.println("Enter the Name of the Book: ");
							String nbname = sc.nextLine();

							System.out.println("Enter the Book Price: ");
							int nbprice = sc.nextInt();

							sc.nextLine();
							System.out.println("Enter the Favourite author: ");
							String nfauther = sc.nextLine();

							System.out.println("Enter the Book's Publication: ");
							String nbpublication = sc.nextLine();

							e[i].setBid(nbid);
							e[i].setBname(nbname);
							e[i].setBprice(nbprice);
							e[i].setBpublication(nbpublication);
							e[i].setFauther(nfauther);
						}

					}

					break;



				case 4:

					System.out.println("Enter Book Price you want to search: ");
					String BkPublication = sc.nextLine();

					for(int i=0; i<e.length; i++ )
					{
						if(BkPublication.equals(e[i].getBpublication()))
						{
							System.out.println("Enter the book id: ");
							int nbid = sc.nextInt();

							sc.nextLine();
							System.out.println("Enter the Name of the Book: ");
							String nbname = sc.nextLine();

							System.out.println("Enter the Book Price: ");
							int nbprice = sc.nextInt();

							sc.nextLine();
							System.out.println("Enter the Favourite author: ");
							String nfauther = sc.nextLine();

							System.out.println("Enter the Book's Publication: ");
							String nbpublication = sc.nextLine();

							e[i].setBid(nbid);
							e[i].setBname(nbname);
							e[i].setBprice(nbprice);
							e[i].setBpublication(nbpublication);
							e[i].setFauther(nfauther);
						}

					}

					break;

				}
				break;

			case 6:

				System.out.println("select Delete by Option-\n1: Book ID \n2: Book Name"
						+ "\n3: book Price \n4: Book Author");
				System.out.println("Enter the choise: ");
				int ch1 = sc.nextInt();

				switch(ch1)
				{
				case 1:

					System.out.println("Enter Book Id you want to Delete: ");
					int BkId = sc.nextInt();

					for(int i=0; i<e.length; i++ )
					{
						if(BkId  == e[i].getBid())
						{
							for(int j = i; j<e.length; j++)
							{
								if(j+1<e.length)
								{
									e[j] = e[j+1];
								}
							}

						}

					}
					size--;

					for(int k = 0; k<e.length-1; k++)
					{
						System.out.println(e[k].getBid()+"\t"+e[k].getBname()+"\t"+e[k].getBprice() +"\t"+e[k].getBpublication() +"\t"+e[k].getFauther());

					}


					break;


				case 2:

					System.out.println("Enter Book Name you want to Delete: ");
					String BkName = sc.nextLine();

					for(int i=0; i<e.length; i++ )
					{
						if(BkName.equals(e[i].getBname()))
						{
							for(int j = i; j<e.length; j++)
							{
								if(j+1<e.length)
								{
									e[j] = e[j+1];
								}
							}

						}

					}
					size--;

					for(int k = 0; k<e.length-1; k++)
					{
						System.out.println(e[k].getBid()+"\t"+e[k].getBname()+"\t"+e[k].getBprice() +"\t"+e[k].getBpublication() +"\t"+e[k].getFauther());

					}

					break;


				case 3:

					System.out.println("Enter Book Price you want to Delete: ");
					int BkPrice = sc.nextInt();

					for(int i=0; i<e.length; i++ )
					{
						if(BkPrice  == e[i].getBprice())
						{
							for(int j = i; j<e.length; j++)
							{
								if(j+1<e.length)
								{
									e[j] = e[j+1];
								}
							}

						}

					}
					size--;

					for(int k = 0; k<e.length-1; k++)
					{
						System.out.println(e[k].getBid()+"\t"+e[k].getBname()+"\t"+e[k].getBprice() +"\t"+e[k].getBpublication() +"\t"+e[k].getFauther());

					}

					break;


				case 4:

					System.out.println("Enter Book Name you want to Delete: ");
					String BkPublication = sc.nextLine();

					for(int i=0; i<e.length; i++ )
					{
						if(BkPublication.equals(e[i].getBpublication()))
						{
							for(int j = i; j<e.length; j++)
							{
								if(j+1<e.length)
								{
									e[j] = e[j+1];
								}
							}

						}

					}
					size--;

					for(int k = 0; k<e.length-1; k++)
					{
						System.out.println(e[k].getBid()+"\t"+e[k].getBname()+"\t"+e[k].getBprice() +"\t"+e[k].getBpublication() +"\t"+e[k].getFauther());

					}

					break;


				case 5:

					System.out.println("Enter Book Id you want to Delete: ");
					String BkAuthor = sc.nextLine();

					for(int i=0; i<e.length; i++ )
					{
						if(BkAuthor.equals(e[i].getFauther()))
						{
							for(int j = i; j<e.length; j++)
							{
								if(j+1<e.length)
								{
									e[j] = e[j+1];
								}
							}

						}

					}
					size--;

					for(int k = 0; k<e.length-1; k++)
					{
						System.out.println(e[k].getBid()+"\t"+e[k].getBname()+"\t"+e[k].getBprice() +"\t"+e[k].getBpublication() +"\t"+e[k].getFauther());

					}


					break;


				}
				break;

			case 7:

				System.out.println("select option from below to count by-\n1: Book Name \n2: Book Price"
						+ "\n3: Book Publication \n4: Book Author");
				System.out.println("Enter the choise: ");
				ch = sc.nextInt();

				switch(ch)
				{
				case 1:

					int count=0;
					System.out.println("Enter the Book Name: ");
					sc.nextLine();
					String BkName = sc.nextLine();

					for(int i=0; i<e.length; i++)
					{
						if(BkName.equals(e[i].getBname()))
						{
							count++;
						}
					}

					System.out.println("The count of books with th id name is/are: "+count);

					break;


				case 2:

					count=0;
					System.out.println("Enter the Book Price: ");
					sc.nextLine();
					int Bkprice = sc.nextInt();

					for(int i=0; i<e.length; i++)
					{
						if(Bkprice == e[i].getBprice())
						{
							count++;
						}
					}

					System.out.println("The count of books with the price is/are: "+count);

					break;


				case 3:

					count=0;
					System.out.println("Enter the Book Publication: ");
					sc.nextLine();
					String Bkpub = sc.nextLine();

					for(int i=0; i<e.length; i++)
					{
						if(Bkpub.equals(e[i].getBpublication()))
						{
							count++;
						}
					}

					System.out.println("The count of books with the Publication name is/are: "+count);

					break;

				case 4:

					count=0;
					System.out.println("Enter the Book Author: ");
					sc.nextLine();
					String Bkauthor = sc.nextLine();

					for(int i=0; i<e.length; i++)
					{
						if(Bkauthor.equals(e[i].getFauther()))
						{
							count++;
						}
					}

					System.out.println("The count of books with the same author is/are: "+count);

					break;

				}	

				break;

			case 8:


				for(int i=0;i<e.length;i++)
				{
					for(int j=i+1;j<e.length;j++)
					{
						if(e[i].getBid() > e[j].getBid())
						{
							Employee temp = e[i];
							e[i] = e[j];
							e[j] = temp;
						}

					}
				}

				break;

			case 9:

				ch =11;
				System.out.println("Thank You visit again............");
				break;

			}


		}
		while(ch < 10);


	}
}