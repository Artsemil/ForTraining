provider "aws" {
  region     = "us-west-2"
}

resource "aws_vpc" "TestVPC" {
  cidr_block       = "190.160.0.0/26"
  instance_tenancy = "default"
  tags = {
    Name = "TestVPC"
  }

}

resource "aws_subnet" "privateSubnet" {
  vpc_id     = aws_vpc.TestVPC.id
  cidr_block = "190.160.0.0/28"
  tags = {
    Name = "privateSubnet"
  }

}
