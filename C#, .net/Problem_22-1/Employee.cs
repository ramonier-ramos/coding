//------------------------------------------------------------------------------
// <auto-generated>
//    This code was generated from a template.
//
//    Manual changes to this file may cause unexpected behavior in your application.
//    Manual changes to this file will be overwritten if the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace Problem_22_1
{
    using System;
    using System.Collections.Generic;
    
    public partial class Employee
    {
        public Employee()
        {
            this.Customers = new HashSet<Customer>();
            this.Employee1 = new HashSet<Employee>();
        }
    
        public short EmpNo { get; set; }
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string JobTitle { get; set; }
        public System.DateTime HireDate { get; set; }
        public decimal Salary { get; set; }
        public Nullable<short> MgrNo { get; set; }
        public byte DeptNo { get; set; }
    
        public virtual ICollection<Customer> Customers { get; set; }
        public virtual ICollection<Employee> Employee1 { get; set; }
        public virtual Employee Employee2 { get; set; }
    }
}