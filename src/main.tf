resource "google_compute_network" "vpc_network" {
  name = "devsecops-network-gcp"
  auto_create_subnetworks = true
  mtu = 1460
}