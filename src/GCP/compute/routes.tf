resource "google_compute_route" "foobar" {
  name        = "devsecops-route"
  dest_range  = "192.168.0.0/16"
  network     = "devsecops-network-gcp"
  next_hop_ip = "192.168.1.1"
  priority    = 100
}