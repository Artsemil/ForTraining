provider "aws" {
  region     = "us-west-2"
}

resource "aws_vpc" "TestVPC" {
  cidr_block       = "0.0.0.0/16"
  instance_tenancy = "default"
  tags = {
    Name = "TestVPC"
  }

}

resource "aws_subnet" "privateSubnet" {
  vpc_id     = aws_vpc.TestVPC.id
  cidr_block = "0.0.0.0/16"
  tags = {
    Name = "privateSubnet"
  }
}

resource "aws_security_group" "AutoSecurityGroupSSHBase" {
  name = "AutoSecurityGroup_SSH"
  description = "AutoSecurityGroup_SSH"
  vpc_id = aws_vpc.TestVPC.id


  ingress {
    cidr_blocks = [
      "10.10.7.0/24",
      "10.9.0.0/16",
      "10.8.8.123/32",
      "10.8.8.156/32",
      "10.8.11.7/32",
      "31.154.25.138/32"
    ]
    description = "ssh incoming"
    from_port = "22"
    protocol = "tcp"
    to_port = "22"
  }
  egress {
    cidr_blocks = [
      "0.0.0.0/0"
    ]
    description = "ssh to anywhere"
    from_port = "22"
    protocol = "tcp"
    to_port = "22"
  }
}
