resource "google_compute_firewall" "i21-ni-gcp" {
  name = "devsecops-fw-cidr-ip"
  network = "devsecops-network-gcp"

  allow {
    protocol = "tcp"
    ports = ["22"]
  }

  priority = 1500
  source_ranges = [
    "192.168.0.0/16",
    "10.168.0.0/16"
    ]
}
